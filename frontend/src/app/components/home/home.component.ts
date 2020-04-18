import { Component, OnInit } from '@angular/core';
import {RestServService }from 'src/app/services/rest-serv.service'
declare var jQuery:any;
declare var $:any; 
declare var Materialize: any; 
declare var M: any; 
declare var options: any; 

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

public people; 
public planets; 
public case ; 
public selectPlanetDetails : any; 
public selectPersonDetails  : any;
public peopleFilterByPlanet : any; 

  constructor(  
    public RestServService: RestServService 
  ) { }


  ngOnInit() {
  this.materializeCss();
  this.findPeople();
  this.findPlanets();
  this.materializeCss()
  }

  findPeople(){
   // console.log('1')
    this.RestServService.getPeople().subscribe
    (res=>{
   
      this.people = res as any; 
    //  console.log('antes del arrego', this.people);
      this.people.sort((b, a) => a.click_count - b.click_count);
    //  console.log('despues del', this.people); 
       this.selectPersonDetails = res[0] as any; 

    })

  }


   findPlanets(){
    
    this.RestServService.getPlanets().subscribe
    (res=>{
   //   console.log(res); 
      this.planets = res as any; 
      //console.log('antes del arrego', this.planets);
      this.planets.sort((b, a) => a.click_count - b.click_count);
     // console.log('despues del', this.planets); 
     this.selectPlanetDetails = res[0] as any; 
    })

  }

  findPeopleById(n?){
    //alert(n);
    this.RestServService.getPeopleBy(n).subscribe
    (res=> {
      
        var response = res as any;
        var planetId = response.planets.id; 
        this.planetSelected(planetId); //cargamos tambien un click en el planeta relacionado 

        response.click_count = ++response.click_count;
        this.RestServService.putPeople(response).subscribe
      (res=>{
        this.findPeople();
      })

    })
  }

  findPlanetById(n?){
 //   alert(n);
    this.RestServService.getPlanetById(n).subscribe
    (res=> {
        console.log('planet By ID', res)
        var response = res as any;
        response.click_count = ++response.click_count;
        this.RestServService.putPlanet(response).subscribe
        (res=>{
          this.findPlanets();
          this.filterPeopleByPlanet();
        })
    })
  }

  filterPeopleByPlanet(){

   // this.selectPlanetDetails                  planeta seleccionado 
   // this.people                               lista de todas las personas 
   // this.peopleFilterByPlanet;                lista filtrada por planeta 
   //console.log('filtranado', this.people);
   this.peopleFilterByPlanet = this.people;
    this.peopleFilterByPlanet = this.peopleFilterByPlanet.filter(
      Array => Array.planets.name === this.selectPlanetDetails.name
    )

   console.log(this.people);

  }

  //persona seleccionada 
  peopleSelected(n){
    // console.log(n);
    this.findPeopleById(n);

     M.toast({html: 'Click en persona Sumado!'})
   }

   planetSelected(n){
    // console.log(n);
   this.findPlanetById(n)
     M.toast({html: 'Click en planeta Sumado!'})
   }

    peopleDetails(n){
     this.RestServService.getPeopleBy(n).subscribe
     (res=>{
       this.selectPersonDetails = res as any; 
     })
    }

    planetDetails(n){

      this.RestServService.getPlanetById(n).subscribe
      (res=>{
        this.selectPlanetDetails = res as any; 
        this.filterPeopleByPlanet();
      })

    }


  cardSelected(n){
    this.case=n; 
  }


  capturePlanetfromPeopleModal(){
    var planetID = this.selectPersonDetails.planets.id;
    //enviamos a buscar planeta con ese id;
    this.planetSelected(planetID);
    
  }
  
  materializeCss(){   
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('.modal');
      var instances = M.Modal.init(elems);
    });
            
  }

}
