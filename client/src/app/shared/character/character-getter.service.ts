import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class CharacterGetterService {

  constructor(private http: HttpClient) {}
// sends a get request to the server to retrieve the list of characters
  getAll(): Observable<any> {
    return this.http.get('http://localhost:8080/characters');
  }
// sends a get request to the server to retrieve a single character
  getOne(id): Observable<any> {
    return this.http.get('http://localhost:8080/characters/' + id);
  }
}
