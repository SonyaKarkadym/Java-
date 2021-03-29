import { TestBed } from '@angular/core/testing';

import { ListtodoServiceService } from './listtodo-service.service';

describe('ListtodoServiceService', () => {
  let service: ListtodoServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListtodoServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
