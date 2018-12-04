/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var RestControllerModule = (function (){
    
    var getConversion = function (grados, tipo, callback){
        axios.get('/convertir/'+grados+'/'+tipo)
            .then(function(temp){
                callback.onSuccess(temp.data);
            })
            .catch(function(error){
                callback.onFailed(error);
            });
    }
    
    return {
        getConversion: getConversion
    };
    
})();
