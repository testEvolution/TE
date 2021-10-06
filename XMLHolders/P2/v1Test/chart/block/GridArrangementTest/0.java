@Test
    public void testEquals() {
        GridArrangement f1 = new GridArrangement(11, 22);
        GridArrangement f2 = new GridArrangement(11, 22);
        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));

        f1 = new GridArrangement(33, 22);
        assertFalse(f1.equals(f2));
        f2 = new GridArrangement(33, 22);
        assertTrue(f1.equals(f2));

        f1 = new GridArrangement(33, 44);
        assertFalse(f1.equals(f2));
        f2 = new GridArrangement(33, 44);
        assertTrue(f1.equals(f2));
    }

    