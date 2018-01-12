import { Component, OnInit } from '@angular/core';
import { CharacterGetterService } from '../shared';

@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css'],
  providers: [CharacterGetterService]
})
export class CharacterListComponent implements OnInit {
  characters: Array<any>;

  constructor(private characterService: CharacterGetterService) { }
 // pulls a list of characters from the repository and instantiates it.
  ngOnInit() {
    this.characterService.getAll().subscribe(
      data => {
        this.characters = data;
      },
      error => console.log(error)
    );
  }
}
