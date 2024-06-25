import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule} from '@angular/common/http';
import { OwnerComponent } from './components/owner/owner.component';
import { PropertyComponent } from './components/owner/property/property.component';
import { ControllerService } from './service/controller.service';
import { AdminComponent } from './components/admin/admin.component';
import { AdminOwnerComponent } from './components/admin/admin-owner/admin-owner.component';
import { OwnerpannelComponent } from './components/ownerpannel/ownerpannel.component';
import { PrintAgreementBillComponent } from './components/owner/print-agreement-bill/print-agreement-bill.component';
import { PrintAgreementComponent } from './components/owner/print-agreement/print-agreement.component';
import { OwnerNavComponent } from './components/owner/owner-nav/owner-nav.component';
import { AdminOwnerNavComponent } from './components/admin/admin-owner-nav/admin-owner-nav.component';
import { ServiceComponent } from './components/admin/service/service.component';
import { LoginComponent } from './components/login/login.component';
import { BillBoardComponent } from './components/admin/bill-board/bill-board.component';


@NgModule({
  declarations: [
    AppComponent,
    OwnerComponent,
    PropertyComponent,
    AdminComponent,
    AdminOwnerComponent,
    OwnerpannelComponent,
    PrintAgreementBillComponent,
    PrintAgreementComponent,
    OwnerNavComponent,
    AdminOwnerNavComponent,
    ServiceComponent,
    LoginComponent,
    BillBoardComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [ControllerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
