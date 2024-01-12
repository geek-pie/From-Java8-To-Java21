package org.example;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        for (int jdkVersion = 9; jdkVersion <= 21; jdkVersion++) {

            System.out.println();
            System.out.println("## **Java " + jdkVersion +"**:");
            String url = "https://openjdk.org/projects/jdk"+jdkVersion+"/";
            if (jdkVersion > 9){
                url = "https://openjdk.org/projects/jdk/"+jdkVersion+"/";
            }
            System.out.println("["+url+"]("+url+")");


            Document document = Jsoup.connect(url).get();

            Elements jepLinks = document.select("blockquote a[href]");

            // 遍历链接并继续访问
            for (Element jepLink : jepLinks) {
                String nextUrl = jepLink.absUrl("href");
                // 发送请求获取网页内容
                Document newDocument = Jsoup.connect(nextUrl).get();

                //标题
                String header = "//*[@id=\"main\"]/h1";
                String headerText = getAndTranslate(newDocument, header);
                if (!headerText.startsWith("JEP") || headerText.startsWith("JEP 3:")){
                    continue;
                }
                System.out.println("##### "+ getAndTranslate(newDocument, header));

//            //release
//            String release = "//*[@id=\"main\"]/table/tbody/tr[5]/td[2]";
//            System.out.println(getAndTranslate(document, release));

                //概括
                String summary = "//*[@id=\"main\"]/div/p[1]";
                System.out.println("> " + getAndTranslate(newDocument, summary));

                System.out.println();
            }

        }

    }

    private static String getAndTranslate(Document document, String xpath){
        //标题
        Elements elements = document.selectXpath(xpath);

        // 打印结果
        if (!elements.isEmpty()) {
            Element targetElement = elements.first();
            assert targetElement != null;
            return targetElement.text();
        } else {
            return "未找到指定元素";
        }
    }
}