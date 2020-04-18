import { TestBed } from '@angular/core/testing';

import { RestServService } from './rest-serv.service';

describe('RestServService', () => {
  let service: RestServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RestServService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
