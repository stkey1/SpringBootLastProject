$(document).ready(() => fetchAllLinks())

function fetchAllLinks() {

    $.getJSON("get-all-links",
        data => {
            let links = '';

            $.each(data, (key, value) => {
                links +=
                    '<tr id="link' + value['id'] + '" >' +
                    '    <td>' + value['id'] + '</td> ' +
                    '    <td>' + value['category'] + '</td> ' +
                    '    <td>' + value['title'] + '</td> ' +
                    '    <td>' + value['price'] + '</td> ' +
                    '    <td> ' +
                    '        <a class="tomato-text" onclick="' + 'deleteLink(\'' + value['id'] + '\')">Delete</a> ' +
                    '    </td>' +
                    '</tr>';
            })

            $('#links-table').append(links);
        }
    )
}

function deleteLink(id) {

    $.ajax({
        url: 'admin/delete-link/' + id,
        method: "GET",
        success: $('#link' + id).remove()
    });
}