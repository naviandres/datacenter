import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RouterModule, Routes} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule} from '@angular/forms';


import { AppComponent } from './app.component';
import { RecargasComponent } from './recargas/recargas.component';
import { CrearRecargaComponent } from './recargas/crear-recarga/crear-recarga.component';
import { LoginComponent } from './login/login/login.component';

const routes: Routes=[
  {path:'',redirectTo:'/login',pathMatch:'full'},
  {path:'recargas',component:RecargasComponent},
  {path:'crear-recarga',component:CrearRecargaComponent},
  {path:'login',component:LoginComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    RecargasComponent,
    CrearRecargaComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
