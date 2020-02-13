
package edu.eci.arsw.blueprints.controllers;

@RestController
@RequestMapping(value = "/url-raiz-recurso")
public class XXController {

@RequestMapping(method = RequestMethod.GET)
public ResponseEntity<?> manejadorGetRecursoXX(){
    try {
        //obtener datos que se enviarán a través del API
        return new ResponseEntity<>(data,HttpStatus.ACCEPTED);
    } catch (XXException ex) {
        Logger.getLogger(XXController.class.getName()).log(Level.SEVERE, null, ex);
        return new ResponseEntity<>("Error bla bla bla",HttpStatus.NOT_FOUND);
    }        
}