import {Recarga} from './recarga';


export class Usuario {
    idUsuario:number;
    documento:string;
    clave:string;
    nombre:string;
    apellido:string;
    recargas: Array<Recarga> = [];
}
