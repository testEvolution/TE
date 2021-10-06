@Test
    public void testCloning() throws CloneNotSupportedException {
        ShortTextTitle t1 = new ShortTextTitle("ABC");
        ShortTextTitle t2 = (ShortTextTitle) t1.clone();
        assertTrue(t1 != t2);
        assertTrue(t1.getClass() == t2.getClass());
        assertTrue(t1.equals(t2));
    }

    