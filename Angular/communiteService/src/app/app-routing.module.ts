import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OwnerComponent } from './components/owner/owner.component';
import { PropertyComponent } from './components/owner/property/property.component';
import { AdminComponent } from './components/admin/admin.component';
import { AdminOwnerComponent } from './components/admin/admin-owner/admin-owner.component';
import { OwnerpannelComponent } from './components/ownerpannel/ownerpannel.component';
import { PrintAgreementBillComponent } from './components/owner/print-agreement-bill/print-agreement-bill.component';
import { PrintAgreementComponent } from './components/owner/print-agreement/print-agreement.component';
import { LoginComponent } from './components/login/login.component';
import { ServiceComponent } from './components/admin/service/service.component';
import { BillBoardComponent } from './components/admin/bill-board/bill-board.component';

const routes: Routes = [
  {path:'',component:LoginComponent},
  
  {path:'owner',component:OwnerpannelComponent,
    children:[
      {path:'',component:OwnerComponent},
      {path:'property',component:PropertyComponent},
    ]
  },
  
  {path:'admin',component:AdminComponent,
    children:[
      {path:'',component:AdminOwnerComponent},
      {path:'adminowner',component:AdminOwnerComponent},
      {path:'services',component:ServiceComponent},
      {path:'bill-board',component:BillBoardComponent},

    ]
  },
  {path:'print-agreement-bill',component:PrintAgreementBillComponent},
  {path:'print-agreement',component:PrintAgreementComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { } 
