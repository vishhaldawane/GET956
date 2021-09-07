/*

      a.js    b.js    c.js
      a.html  b.html    c.html        a.css   b.css   c.css


      Component DRiven Way

                Angular coding by them...
                theyare ready with their framework [ semi developed application ]

      A                               B
      |                               |
      ----------------      ------------------
       |       |      |         |      |      |
      a.html a.css  a.ts      b.html  b.css   b.ts

                  Iterable
                    |  Iterator iterator();
                    Collection
                      |add(Object), remove();
                -----------
                |         |
              List          Set
              |              |
              LL AL           TS  HS
              add add         add  add
*/




import { Component } from '@angular/core';

@Component({
  selector: 'app',             // <script> let p = document.getElementById("principal").value;  </script>
  templateUrl: './app.component.html', //old: VIEW <input type=text id="principal" value=10000>
  styleUrls: ['./app.component.css']    //1 <input type=text value={{principal}}>
})                                  //2 <input type=text  [value]="principal">
                                   //3. <input type=text [(ngModel)]="principal" >
export class AppComponent { // MODEL
  title = 'Emi Calculator';                 //ArrayList jukeBox.add(s1);
  principal: number = 10000;
  rate: number = 10.0;
  years: number = 1;
  si: number = (this.principal * this.rate * this.years)/100;
  isUserLoggedIn: boolean= true;
  
  accountOpeningDate = new Date();

  calculateSimpleInterest() {
    
    this.si = (this.principal * this.rate * this.years)/100;
    console.log('calculated simple interest ',this.si);
  }

}
/*
              angular f/w
              [], @Decorator, @NgModule, @Pipe,
              *ngIf, *ngFor, [()] {{}}

              
  Akshita                 Shwetha
  |                         |
  Airline                   Banking
  |                           |
  FlightEnquiryComponent    AddPayeeComponent
  ts + html + css           ts + html + css



                  Banking Project
        Akshita : Amrita Ameya      Anirudh       Akhilesh 
          |         |       |           |             |
       User     payee   fundtransfer  statement   registration/login   
layer1  ?       table
layer2  ?       pojo
layer3  ?       repo/jdbc+with Junit Testing
layer4          service | with Junit Testing
layer5          controller
layer6          angular
                  |
                  AddPayeeComponent
                  ViewPayeeComponent
                  ViewAllPayeeComponent
                  DeletePayeeComponent

                  laptop speed issue/hang/harddisk crash issue/network/powerfailure
                  h/w s/w p/w 
                  
                            Akshita : Amrita Ameya      Anirudh       Akhilesh   (350 man hours)
Project Day1 28-09-2021 TUE   10      10      10        10            10        = 50 hours
Project Day2 29-09-2021 WED
Project Day3 30-09-2021 THU
Project Day4 01-09-2021 FRI

Project Day5 02-09-2021 SAT
Project Day6 03-09-2021 SUN

Project Day7 04-09-2021 MON
Project Day1 04-09-2021 TUE <-- no coding on this day


 
          Model View Controller Architecture / Design Pattern

  if there is a small hotel
  A is the owner of the hotel
  A is the Chef
  A is the order taker
  A is the food server

         Kitchen [ model means data | database | arraylist | ts ]
                  |                                         p/n/y
                  | C - Chef - Dosa/Pizza/FriedRice
                  |            B      B     B <-- View [ html + css ]
      ---------------------
      | A      |A     A <-- Controllers
      Dining1 Dining2 ....  ..... ...
      |       |
    Customer1 Customer2 ... CustomerN  .. 50
 

    Directives



    Structural
        *ngFor
        *ngIf


          +-------+
          | LOGIN | <-- if i click on this button, then the label should be changed as
          +-------+     LOGOUT <-- if i click again, then the label should be reversed
                            as LOGIN


        Angular is a JavaScript Based Framework

        Installation : 1) node js LTS -> 2) npm command -> install angular CLI [ java ]
        3) IDE - Visual Studio Code [ eclipse ] -> New Project 

        C:\> Or $ -> ng new Airline <-- took much time to load the libraries 
        enter into Airline project
        $ cd airline >  
        $ airline > A DEFAULT COMPONENT IS GIVEN TO US-> AppComponent
    json - java script object notation 


              airline
              |
            -------
            |
            src
            |
            -----------------
            |             |
            AppModule   index.html
            |             <app> </app>
      ----------
      | selector : 'app'
      app <-- name of the component 
      |
  ------------------------------------------
  |  DATA + FUNCTIONS |    VIEW              |STYLE
  app.component.ts  app.component.html  app.component.css
   |                  |                   |
AppComponent        <> <><> <> <>     {} {}{} {} 
  |@Decorator
     




PHOTOFRAME MAKER SHOP
     |
     SEMI DEVELOPED ARCHITECTURE WITH THEM
     |
     THE PIC IS OWNED BY US
  

     Fresher
        SQL PLSQL
              |
              JPL    - IPL
              | Annotation  @DevelopedBy.....meta-data
              Mock Client
              | grade...
              |
              HTML CSS JS
              |
              ANGULAR - framework  @Component, @NgModule, @Pipe

            
   */