import { Component, OnInit } from '@angular/core';

import {Recarga} from '../modelo/recarga';
import { RecargaService } from '../services/recarga.service';

@Component({
  selector: 'app-recargas',
  templateUrl: './recargas.component.html',
  styleUrls: ['./recargas.component.css']
})
export class RecargasComponent implements OnInit {

  recargas: Recarga[];

  constructor(private recargaService:RecargaService) { }

  ngOnInit(): void {
    this.recargaService.getRecargas().subscribe(
      recargas => this.recargas = recargas
    )
  }


}
