@Test
    public void testCloning() throws CloneNotSupportedException {
        DateTitle t1 = new DateTitle();
        DateTitle t2 = (DateTitle) t1.clone();
        assertTrue(t1 != t2);
        assertTrue(t1.getClass() == t2.getClass());
        assertTrue(t1.equals(t2));
    }

    