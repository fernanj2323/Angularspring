import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class RestServService {

  url_api: string = 'http://localhost:8080/api';

  constructor(public httpClient: HttpClient) { 

  }

  getPeople(){
    return this.httpClient.get(this.url_api + '/people')
  }

  getPlanets(){
    return this.httpClient.get(this.url_api + '/planets')
  }

  getPeopleBy(id){
    return this.httpClient.get(this.url_api + '/people/' + id)
  }

  getPlanetById(id){
    return this.httpClient.get(this.url_api + '/planets/' + id)
  }

  putPeople(array){
    return this.httpClient.put(this.url_api + '/people', array)
  }

  putPlanet(array){
    console.log('servicio')
    return this.httpClient.put(this.url_api + '/planet', array)
  }

}
