package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StudentManagerTest {
	
	StudentManager sm;
	
    @BeforeEach
    void setUp() {
        sm = new StudentManager();
    }

	@Test
	void testAddStudent() {
		sm.addStudent("홍길동");
        assertTrue(sm.hasStudent("홍길동")); 
	}

	@Test
	void testRemoveStudent() {

	}

	@Test
	void testHasStudent() {
	
	}

}
