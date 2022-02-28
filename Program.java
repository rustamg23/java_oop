public class Program {
    public static void main(String[] args) {
        Person Cashier = new Person("Valentina", "Solovyeva", "Borisovna", 44);
        Cashier.PrintInfoAboutPerson();
        BoxOffice Kassa = new BoxOffice(Cashier);
        Person Consumer = new Person("Igor", "Ogninskii", "Sergeevich", 17);
        Kassa.setConsumer(Consumer);
        Kassa.PrintInfoAboutBox();
        Kassa.setConsumer(Cashier);
    }
}

    class Person {
        private String name;
        private String surname;
        private String patronymic;
        private Integer age;

        Person() {

        }

        Person(String _name, String _surname, String _patronymic, Integer _age) {
            name = _name;
            surname = _surname;
            patronymic = _patronymic;
            age = _age;
        }

        public void setAge(Integer _age) {
            if (_age <= 200 && _age >= 0)
                age = _age;
            else
                System.out.print("Person must be human, not elf or any mythical guys!");
        }

        public void setName(String _name) {
            if (_name.length() < 21)
                name = _name;
            else
                System.out.print("Person must have name less than 20 letters. If you are not human please stop use this code!");
        }

        public void setSurname(String _surname) {
            if (_surname.length() < 21)
                surname = _surname;
            else
                System.out.print("Please stop, only humans can work with dat");
        }

        public void setPatronymic(String _patronymic) {
            if (_patronymic.length() < 21)
                patronymic = _patronymic;
            else
                System.out.print("Go away!!!");
        }

        public Integer getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void PrintInfoAboutPerson() {
            System.out.println
                    (
                            "Person: \n" +
                            "\tName: " + getName() + "\n" +
                            "\tSuname: " + getSurname()+ "\n" +
                            "\tPatronymic: " + getPatronymic()+"\n" +
                            "\tAge: " + getAge()
                    );
        }
    }

    class BoxOffice {
        private Person cashier;
        private Person consumer;

        BoxOffice(Person _cashier) {
            cashier = _cashier;
        }

        public void setConsumer(Person _consumer) {
            if (
                    _consumer.getName() == cashier.getName() &&
                            _consumer.getSurname() == cashier.getSurname() &&
                            _consumer.getPatronymic() == cashier.getPatronymic()
            ) {
                System.out.print("Do you really want to buy something? Haha back to work!");
            } else {
                consumer = _consumer;
            }
        }

        public void PrintInfoAboutBox() {
            System.out.println
                    (
                            "Cashier: \n" + '\t' + cashier.getName() + ' ' +
                                    cashier.getSurname() + ' ' +
                                    cashier.getPatronymic() +'\n'+
                                    "Current consumer: \n" +'\t' +  consumer.getName() + ' ' +
                                    consumer.getSurname() + ' ' +
                                    consumer.getPatronymic()
                    );
        }

    }


