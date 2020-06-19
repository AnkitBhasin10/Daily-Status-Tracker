import { TestBed } from '@angular/core/testing';

import { LoginAndRegisterServiceService } from './login-and-register-service.service';

describe('LoginAndRegisterServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LoginAndRegisterServiceService = TestBed.get(LoginAndRegisterServiceService);
    expect(service).toBeTruthy();
  });
});
