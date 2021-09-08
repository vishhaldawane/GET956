import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-button',
  template: '<html> <head><title>LikeDislike</title></head> <body> <button class="{{b1Class}}" (click)="goLike()"> {{likeLabel}}{{likeCounter}}  </button> <button class="{{b2Class}}" (click)="goDisLike()">{{dislikeLabel}}{{disLikeCounter}} </button></body> </html>',
  styles: [ 
    `
      .liked {
        background-color: green;
        color:white;
        padding: 15px 32px;
        font-size: 16px;
      }
      .disliked {
        background-color: red;
        color:white;
        padding: 15px 32px;
        font-size: 16px;
      }
    `
  ]
  //templateUrl: './button.component.html',
  //styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {

  b1Class: string = "liked";
  b2Class: string = "disliked";

  likeCounter: number=100;
  disLikeCounter: number=27;

  likeLabel: string = 'Like';
  dislikeLabel: string = 'DisLike';
  
  goLike() {
    console.log('like is clicked...');
    ++this.likeCounter;
  }
  goDisLike() {
    console.log('dislike is clicked...');
    ++this.disLikeCounter;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
