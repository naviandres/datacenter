import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {  Observable, throwError } from 'rxjs';

import {Usuario} from '../modelo/usuario';


@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  public urlBackend: string = 'http://localhost:8080/api/login';

  constructor(private http: HttpClient) { }

  login(usuario: Usuario): Observable<any> {
    return this.http.post(this.urlBackend, usuario)
  }
}
