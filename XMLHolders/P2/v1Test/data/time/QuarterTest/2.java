@Test
    public void testEquals() {
        Quarter q1 = new Quarter(2, 2002);
        Quarter q2 = new Quarter(2, 2002);
        assertTrue(q1.equals(q2));
    }

    