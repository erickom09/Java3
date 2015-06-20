/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(documen).ready(function(){
$("#boton-hola").click(function(){
   /*
    * vamos a enviar el dato del nombre a nuestro servelt hola
    * y 
    * esperar la respuesta del servlet hola
    */ 
   $.ajax({
      url:'hola',
      method:'POST',
      data:{
          nombre:$("#nombre").val()
      },
      success: function(datos){
          $("#respuesta").html(datos);
      } ,
      failure:function(){
          
      }
   });
});
});