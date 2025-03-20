$(document).ready(function () {
    comunicacion().then(function() {
        console.log("La aplicacion sigue su ejecucion");
    });
});


async function comunicacion() {
    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletTest",
        data: $.param({
            usuario: "Niko",
            tecnologia: "Java"
        }),
        success: function (data) {
            console.log("Petición correcta");
            let parsedData = JSON.parse(data);
            console.log(parsedData);
            console.log(parsedData[0]["titulo"]);
            console.log(parsedData[0]["copias"]);
        }
    });
}
