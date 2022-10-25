public class Periodical extends Item
{
    private int issueNum;

    public int getIssueNum()
    {
        return issueNum;
    }

    public void setIssueNum(int issueNum)
    {
        this.issueNum = issueNum;
    }

    Periodical()
    {
        issueNum = 0;
        setTitle("");
    }

    Periodical(int i, String t)
    {
        issueNum = i;
        setTitle(t);
    }

    @Override
    public String getListing()
    {
        return "Periodical Title - " + this.getTitle() + "\nIssue # - " + this.getIssueNum();
    }
}