package MordorsCrueltyPlan;

public class Gandalf {
    private int points;

    private int getPoints() {
        return this.points;
    }

    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "cram":
                this.points += 2;
                break;
            case "lembas":
                this.points += 3;
                break;
            case "melon":
                this.points += 1;
                break;
            case "apple":
                this.points += 1;
                break;
            case "honeycake":
                this.points += 5;
                break;
            case "mushrooms":
                this.points -= 10;
                break;
            default:
                this.points -= 1;
                break;
        }
    }

    private String getMood() {
        int points = this.getPoints();
        if (points < -5) {
            return "Angry";
        } else if (points < 0) {
            return "Sad";
        } else if (points < 15) {
            return "Happy";
        }
        return "JavaScript";
    }

    @Override
    public String toString() {
        return this.getPoints() + System.lineSeparator() + this.getMood();
    }
}
