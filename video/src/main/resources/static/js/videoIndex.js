$("#b1").click(function () {
    $(".m-item").toggleClass("m-mobile-hide");
});
$('#payButton').popup({
    popup: $('.popup.payQR'),
    on: 'click',
    position: 'bottom center'
});
$('.ui.dropdown').dropdown({
    on: 'hover'
})

function selectOnchang(obj){
    var value = obj.options[obj.selectedIndex].value;
    axios.get('/getVideoListByType?value=' + value).then(response => {
        location.href ='/getVideoListByType?value=' + value;
    })
}