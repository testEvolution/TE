@Test
    public void test9999Previous() {
        Year current = new Year(9999);
        Year previous = (Year) current.previous();
        assertEquals(9998, previous.getYear());
    }

    