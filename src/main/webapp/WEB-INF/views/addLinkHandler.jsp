<%
    String link = request.getParameter("link");

    // links.txt dosyasına linki ekle
    BufferedWriter writer = new BufferedWriter(new FileWriter("links.txt", true));
    writer.write(link);
    writer.newLine();
    writer.close();
%>

<meta http-equiv="refresh" content="0; url=home.jsp" />
