import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {  Observable, throwError } from 'rxjs';
import { map, catchError } from 'rxjs/operators';


import {Recarga} from '../modelo/recarga';

@Injectable({
  providedIn: 'root'
})
export class RecargaService {

  public urlBackend: string = 'http://localhost:8080/api/recargas';

  constructor(private http: HttpClient) { }

    getRecargas(): Observable<Recarga[]>{
      return  this.http.get<Recarga[]>(this.urlBackend);
    }

    crear(recarga: Recarga): Observable<Recarga> {
      return this.http.post(this.urlBackend, recarga).pipe(
        map((response: any) => response.recarga as Recarga),
        catchError(e => {
          if(e.error.mensaje){
            console.error(e.error.mensaje);
          }
          return throwError(e);
        })
      );
    }
}
