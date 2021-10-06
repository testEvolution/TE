@Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestDrawable)) {
                return false;
            }
            return true;
        }
        