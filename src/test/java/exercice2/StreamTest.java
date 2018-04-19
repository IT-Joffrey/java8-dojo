package exercice2;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class StreamTest {
	
    @Test
    public void testStream01() {
        Assert.assertThat(Stream01.execute().size(), equalTo(4));
    }
    
    @Test
    public void testStream02() {
        Assert.assertThat(Stream02.execute().size(), equalTo(2));
    }
    
    @Test
    public void testStream03() {
        Assert.assertThat(Stream03.execute().size(), equalTo(4));
    }
    
    @Test
    public void testStream05() {
        Assert.assertThat(Stream05.execute(), equalTo(5.0));
    }
    
    @Test
    public void testStream06() {
        Assert.assertThat(Stream06.execute(), equalTo("http://cdn-0.nflximg.com/images/2891/Fracture300.jpg"));
    }
    
    @Test
    public void testStream07() {
        Assert.assertThat(Stream07.execute().size(), equalTo(4));
    }
}
