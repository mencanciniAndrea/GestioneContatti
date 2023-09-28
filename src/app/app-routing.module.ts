import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { ViewContattoComponent } from './components/view-contatto/view-contatto.component';
import { EditContattoComponent } from './components/edit-contatto/edit-contatto.component';
import { SearchContattoComponent } from './components/search-contatto/search-contatto.component';
import { MainMenuComponent } from './components/main-menu/main-menu.component';

const routes: Routes = [
  {
    path: '',
    component: MainMenuComponent
  },
  {
    path: 'search',
    component: SearchContattoComponent
  },
  {
    path: 'insert',
    component: HomeComponent
  },
  {
    path: 'admin/view/:id',
    component: ViewContattoComponent
  },
  {
    path: 'admin/edit/:id',
    component: EditContattoComponent
  },
  {
    path: 'admin',
    component: AdminComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
