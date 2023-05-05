$(document).ready(() => fetchLinks('Link'))

function fetchLinks(category) {

    $.ajax({
        url: 'api/v1/fetch-links-by-category/' + category,
        method: "GET",
        success: data => {

            if (data.length === 0) {
                document.getElementById('links-table').innerHTML = "<p class='not-found'>No links available in this category.</p>";
                return;
            }

            writeLink   Html(data);
        }
    });

    $('label').removeClass('white-back-text');
    $('#' + category).addClass('white-back-text');
}