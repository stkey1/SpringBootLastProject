function writeLinkHtml(data) {
    let linkHtml = "";
    let linkTable = document.getElementById('links-table');

    linkTable.innerHTML = "";

    for (let i = 0; i < data.length; i++) {

        linkHtml += "" +
            "<td>\n" +
            "    <div class=\"link-box\">\n" +
            "        <h2>" + data[i]['title'] + "</h2>\n" +
            "        <p>" + data[i]['description'] + "</p>\n" +
            "        <p class=\"link-price\">Price: " + data[i]['price'] + "TL</p>\n" +
            "        <div class='link-container-buttons'>\n" +
            "            <a href=\"./payment?id=" +data[i]['id'] + "\"><button type=\"button\" class=\"button\">Buy</button></a>\n" +
            "            <a href=\"./comments/" + data[i]['id'] + "\"><button type=\"button\" class=\"button\">Comment</button></a>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</td>\n";

        linkTable.innerHTML = linkHtml;
    }
}