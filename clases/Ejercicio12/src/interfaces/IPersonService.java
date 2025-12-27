package interfaces;

import model.Person;

public interface IPersonService {

Person createPerson();
int calculateAge(Person person);
boolean lessThan (Person person , Integer age);
void showPerson(Person person);
    
}
