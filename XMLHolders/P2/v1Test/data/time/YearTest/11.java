@Test
    public void test1900Next() {
        Year current = new Year(1900);
        Year next = (Year) current.next();
        assertEquals(1901, next.getYear());
    }

    