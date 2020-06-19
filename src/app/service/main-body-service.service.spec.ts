import { TestBed } from '@angular/core/testing';

import { MainBodyServiceService } from './main-body-service.service';

describe('MainBodyServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MainBodyServiceService = TestBed.get(MainBodyServiceService);
    expect(service).toBeTruthy();
  });
});
