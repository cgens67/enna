use strict;
use warnings;

my $file = '.github/workflows/build.yml';
open my $fh, '<', $file or die;
my $content = do { local $/; <$fh> };
close $fh;

$content =~ s/  push:\n    paths-ignore:\n      - 'README\.md'\n      - 'fastlane\/\*\*'\n      - 'assets\/\*\*'\n      - '\.github\/\*\*\/\*\.md'\n      - '\.github\/FUNDING\.yml'\n      - '\.github\/ISSUE_TEMPLATE\/\*\*'/  push:/s;

open my $out, '>', $file or die;
print $out $content;
close $out;
