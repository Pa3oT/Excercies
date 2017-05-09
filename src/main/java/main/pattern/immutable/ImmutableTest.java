package main.pattern.immutable;

import java.util.Date;

public final class ImmutableTest {
    private final String name;
    private final Date dateOfBirth;
    private final String[] skills;

    public ImmutableTest(String name, Date dateOfBirth, String... skills) {
        this.name = name;
        /*при конструировании объекта, полям присваиваются новые объекты,
         *вместо ссылок
         */
        this.dateOfBirth = new Date(dateOfBirth.getTime());
        this.skills = skills.clone();
    }

    public String getName() {
        return name;
    }

    /*
     * Возвращаем новый объект Date, вместо передачи ссылки на текущий
     */
    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    /*
     * Возвращаем клонированный массив, вместо ссылки на объект массива
     */
    public String[] getSkills() {
        return skills.clone();
    }
}