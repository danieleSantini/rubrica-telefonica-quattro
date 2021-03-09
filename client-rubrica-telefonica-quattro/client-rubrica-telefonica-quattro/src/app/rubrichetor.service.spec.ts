import { TestBed } from '@angular/core/testing';

import { RubrichetorService } from './rubrichetor.service';

describe('RubrichetorService', () => {
  let service: RubrichetorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RubrichetorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
