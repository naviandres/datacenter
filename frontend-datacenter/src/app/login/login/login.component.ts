import { Component, OnInit } from '@angular/core';

import {Usuario} from '../../modelo/usuario';
import { UsuarioService } from '../../services/usuario.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public usuario: Usuario = new Usuario();
  public errores: string[];

  constructor(private usuarioService:UsuarioService,
    private router: Router) { }

  ngOnInit(): void {
  }

  public login(): void {
    this.usuarioService.login(this.usuario).subscribe(
      usuario => {  
        sessionStorage.setItem('usuario',usuario.idUsuario+"");
        this.router.navigate(['/recargas'])
      },
      err => {
        alert("Error")  
      }
    );
  }
}
