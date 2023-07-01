import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {Recarga} from '../../modelo/recarga';
import {Operador} from '../../modelo/operador';
import {Usuario} from '../../modelo/usuario';

import { RecargaService } from '../../services/recarga.service';
import { OperadorService } from '../../services/operador.service';


@Component({
  selector: 'app-crear-recarga',
  templateUrl: './crear-recarga.component.html',
  styleUrls: ['./crear-recarga.component.css']
})
export class CrearRecargaComponent implements OnInit {

  public recarga: Recarga = new Recarga();
  public usuario: Usuario ;
  public operadores: Operador[];

  constructor(private recargaService:RecargaService,
    private operadorService:OperadorService,
    private router: Router) { }

  ngOnInit(): void {
    this.operadorService.getOperadores().subscribe(
      operadores => this.operadores = operadores
    )

   this.usuario=new Usuario();
   this.usuario.idUsuario=+sessionStorage.getItem('usuario');
   this.recarga.usuario=this.usuario;
  }

  public crear(): void {
    this.recargaService.crear(this.recarga).subscribe(
      recarga => {
        alert('Recarga guardada con exito')
        this.router.navigate(['/recargas'])
      },
      err => {
        alert('Error')
        console.error(err.error.errors as string[]);
      }
    );
  }


}
