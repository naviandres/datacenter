import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {  Observable } from 'rxjs';

import {Operador} from '../modelo/operador';

@Injectable({
  providedIn: 'root'
})
export class OperadorService {

  public urlBackend: string = 'http://localhost:8080/api/operadores';


  constructor(private http: HttpClient) { }

  getOperadores(): Observable<Operador[]>{
    return  this.http.get<Operador[]>(this.urlBackend);
  }

}
