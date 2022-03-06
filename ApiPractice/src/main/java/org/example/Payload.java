package org.example;

public class Payload {

    public static String getPostData()
    {
        String r = "{\n" +
                "    \"location\":{\n" +
                "        \"lat\":-38.383494,\n" +
                "        \"lng\":33.427362\n" +
                "    },\n" +
                "    \"accuracy\": 50,\n" +
                "    \"name\": \"frontlinehouse\",\n" +
                "    \"phone_number\":\"(+91) 727 520 3306\",\n" +
                "    \"address\":\"29 side layout \",\n" +
                "    \"types\":[\"shoepark\",\"shop\"],\n" +
                "    \"website\":\"http://google.com\",\n" +
                "    \"language\":\"French-IN\"\n" +
                "\n" +
                "\n" +
                "}\n";
        return r;
    }
    public static String getPOstdataXml()
    {
        String body="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<root>\n" +
                "    <location>\n" +
                "        <lat>-38.383494</lat>\n" +
                "        <lng>33.427362</lng>\n" +
                "    </location>\n" +
                "    <accuracy>50</accuracy>\n" +
                "    <name>The Mens store</name>\n" +
                "    <phone_number>(+91) 983 893 3937</phone_number>\n" +
                "    <address>Anna Salai, Chennai</address>\n" +
                "    <types>shoe park</types>\n" +
                "    <types>kadai</types>\n" +
                "    <website>http://google.com</website>\n" +
                "    <language>tamil-IN</language>\n" +
                "</root>\n";
        return body;
    }
    public static String getAddBook(String isbn,String aisle)
    {
        String s="{\n" +
                "\n" +
                "\"name\":\"Learn Appium Automation with Java hahahah\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"Rohit \"\n" +
                "}\n";
        return s;
    }
    public static String deleteBOOK(String id,String farzi)
    {
        String e="{\n" +
                " \n" +
                "\"ID\" : \""+id+farzi+"\"\n" +
                " \n" +
                "} \n";
        return e;
    }



}
