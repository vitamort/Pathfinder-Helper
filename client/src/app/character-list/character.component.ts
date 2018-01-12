import { Component, OnInit, Input } from '@angular/core';
import { CharacterGetterService } from '../shared';

@Component({
  selector: 'app-character',
  templateUrl: './character.component.html',
  styleUrls: ['./character.component.css'],
  providers: [CharacterGetterService]
})
export class CharacterComponent implements OnInit {
  hidden: boolean;
  @Input() name: string;
  @Input() id: number;

  constructor(private characterService: CharacterGetterService) {
    this.hidden = true;
  }

  ngOnInit() {
  }
 // toggle function to determine if the character information is shown
  onClick = function() {
    let character;
    const body = document.getElementById(this.name);
    if (this.hidden === true) {
      this.hidden = false;
      this.characterService.getOne(this.id).subscribe(
        data => {
          character = data;
          alert(character.name);
          let text = '';
          for (const a of character.integerAttributes) {
            text = text.concat(a.name + ': ' + a.value + '\n');
          }
          for (const a of character.stringAttributes) {
            text = text.concat(a.name + ': ' + a.value + '\n');
          }
          body.innerText = text;
        },
        error => console.log(error)
      );
    } else {
      this.hidden = true;
      document.getElementById(this.name).innerText = '';
    }
  };
}
