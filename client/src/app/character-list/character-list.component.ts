import { Component, OnInit } from '@angular/core';
import { CharacterService, GiphyService } from '../shared';

@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css'],
  providers: [CharacterService, GiphyService]
})
export class CharacterListComponent implements OnInit {
  characters: Array<any>;

  constructor(private characterService: CharacterService,
              private giphyService: GiphyService) { }

  ngOnInit() {
    this.characterService.getAll().subscribe(
      data => {
        this.characters = data;
        for (const character of this.characters) {
          this.giphyService.get(character.name).subscribe(url => character.giphyUrl = url);
        }
      },
      error => console.log(error)
    );
  }
}
