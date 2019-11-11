import { Component } from '@angular/core';
import {HttpService} from './http-service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pyramid';
  isPyramid = null;

  constructor(private _http: HttpService) { }

  pyramidCheck(word) {
    if (word == "")
      this.isPyramid = false;
    else {
      this._http.isPyramidWord(word).subscribe(data => {
        this.isPyramid = data;
      });
    }
     
    return this.isPyramid;
  }
}
