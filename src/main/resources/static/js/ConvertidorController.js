/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ConvertidorControllerModule = (function () {
    
    var getConversionTemperatura = function (){
        var grados = document.getElementById("grados").value;
        var tipo = document.getElementById("tipoGrados").value;
        var callback = {
            onSuccess: function (resultado){
                if (tipo == "C"){
                    document.getElementById("resultado").innerHTML = grados+"°F = "+resultado+"°C";
                }else{
                    document.getElementById("resultado").innerHTML = grados+"°C = "+resultado+"°F";
                }
            },
            onFailed: function (exception){
                console.log(exception);
                alert("There is a problem with our servers. We apologize for the inconvince, please try again later");
            }
        };
        RestControllerModule.getConversion(grados, tipo, callback);
    };
    
    return {
        getConversionTempetatura: getConversionTemperatura
    };
    
})();

