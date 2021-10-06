@Test
    public void test9999Next() {
        Year current = new Year(9999);
        Year next = (Year) current.next();
        assertNull(next);
    }

    