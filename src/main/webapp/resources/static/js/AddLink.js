
$(document).ready(() => $('#price').val(''));

$('#price').keypress(e => !String.fromCharCode(e.which).match(/\D/g));

$('#add-link-form').validate({
    submitHandler: form => {
        $.ajax({
            url: 'admin/add-link-action',
            method: "POST",
            data: $('#add-link-form').serialize(),
            success: data => {
                let message = document.getElementById('admin-prompt');

                if (data === 'error')
                    message.innerHTML = '<p class="tomato-text">Please fill out all the fields properly.</p>'
                else {
                    message.innerHTML = '<p class="green-text">New link added!</p>'
                    $('#add-link-form').trigger("reset");
                }
            }
        })
    },
    rules: {
        title: {
            required: true,
            minlength: 5,
            maxlength: 30,
        },
        price: {
            required: true,
            min: 50,
            max: 10000,
        },
        description: {
            required: true,
            minlength: 10,
            maxlength: 10000,
        }
    },
    messages: {
        title: {
            required: "Please enter a link title",
            minlength: "link title must consist of at least 5 characters",
            maxlength: "link title must be no more than 30 characters long"
        },
        price: {
            required: "Please enter a price",
            min: "Price must be at least 50TL",
            max: "Price must be no more than 10000TL!"
        },
        description: {
            required: "Please provide a description",
            minlength: "Description must be at least 10 characters long",
            maxlength: "Description must be no more than 10,000 characters long"
        }
    },
    errorClass: "form-input-error warning-message"
})


